$(function () {
    $("#btn").on("click",function () {
       $.ajax({
           url:"list",
           type:"GET",
           dataType:"json",
           success:function (data) {
               alert(data);
               $(data).each(function (index,alcohol) {
                   var $li = $("<li></li>");
                   $li.append(alcohol.id+alcohol.name);
                   $("#ul").append($li);
               })
           }
       });
    });
})