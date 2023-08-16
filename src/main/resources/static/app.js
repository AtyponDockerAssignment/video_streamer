function fetchEntitiesAndUpdateView() {
    fetch("/api/v1/blobs")
        .then(response => response.json())
        .then(data => updateView(data))
        .catch(error => console.error("Error fetching entities:", error));
}

function updateView(entities) {
    const tableBody = document
        .getElementById("entityTable")
        .querySelector("tbody");

    tableBody.innerHTML = ""; // Clear the current rows

    entities.forEach(entity => {
        const row = tableBody.insertRow();
        row.insertCell(0).textContent = entity.id;

        const anchorElement = document.createElement("a");
        anchorElement.href = entity.url;
        anchorElement.textContent = entity.url;
        row.insertCell(1).appendChild(anchorElement);
    });
}

// Initial fetch and view update
fetchEntitiesAndUpdateView();

// Set up polling every 10 seconds
setInterval(fetchEntitiesAndUpdateView, 10000);