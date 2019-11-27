$(function () {
    alert("q");
    $("#btn").on("click",function () {
        alert("w");

        $.get("list",function (data) {
            console.log(data);
            $("#btx").text(data);
        });
    });
})