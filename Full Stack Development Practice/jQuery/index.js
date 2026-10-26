//jQuery = $

$("h1").addClass("big-title margin-50");

$("h1").addClass("margin-50");

//$("h1").text("Bye.");

//$("button").text("Don't Click Me");

//$("button").text("<em></em>");

$("a").attr("href", "https://www.yahoo.com");

/*$("h1").click(function() {
    $("h1").css("color", "purple");
});


/*for (var i = 0; i<5; i++) {
    document.querySelectorAll("button")[i].addEventListener("click", function() {
        document.querySelector("h1").style.color = "purple";
    });
}

$("button").click(function() {
    $("h1").css("color", "purple");
});

$("input").keypress(function(event) {
    console.log(event.key);
});

$(document).keypress(function(event) {
    $("h1").text(event.key);
});*/

/*$("h1").on("mouseover", function() {
    $("h1").css("color", "purple");
});

$("h1").before("<button>New</button>");

$("h1").after("<button>New</button>");

$("h1").prepend("<button>New</button>");

$("h1").append("<button>New</button>");

$("button").on("click", function() {
    $("h1").hide();
});

$("button").on("click", function() { 
    $("h1").show();
});

$("button").on("click", function() {
    $("h1").toggle();
});

$("button").on("click", function() {
    $("h1").fadeOut();
});

$("button").on("click", function() {
    $("h1").fadeIn();
});

$("button").on("click", function() {
    $("h1").slideUp();
});

$("button").on("click", function() {
    $("h1").slideDown();
});

$("button").on("click", function() {
    $("h1").animate({opacity: 0.5});
});*/

$("button").on("click", function() {
    $("h1").slideUp().slideDown().animate({opacity: 0.5});
});