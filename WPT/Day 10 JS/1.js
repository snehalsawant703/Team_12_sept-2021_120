function tweet() {
    let parentDiv = document.querySelector("div");
    let prevtag = parentDiv.innerHTML;
    console.log("100");
    let newwwtag = `<div class="bg-success fs-5  text-light border-bottom">

            Lorem ipsum dolor sit amet, consectetur adipisicing elit.Vel quia rem itaque, minus repellendus
            numquam
            nihil quaerat? Veniam, deserunt! Maxime corporis adipisci sapiente animi itaque, nesciunt
            perferendis
            nostrum saepe, iste architecto ut cum consectetur fuga distinctio quo accusantium recusandae dolorum
            ex
            excepturi asperiores molestias dolor nam esse quod! Provident, iste.

        </div>`;
    parentDiv.innerHTML = newwwtag + prevtag;
}