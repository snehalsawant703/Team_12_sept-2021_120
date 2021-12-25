function tweet() {
    let parentDiv = document.querySelector("#id1");
    let prevtag = parentDiv.innerHTML;

    let inputval = document.querySelector("#input").value;
    let neww = `<div class="bg-primary fs-5 text-light border-bottom"> ${inputval}</div>`;

    parentDiv.innerHTML = `${neww} ${prevtag}`;
    document.querySelector("#input").value = "";
}