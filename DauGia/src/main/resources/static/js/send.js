var coll = document.getElementsByClassName("collapsible");

for (let i = 0; i < coll.length; i++) {
    coll[i].addEventListener("click", function () {
        this.classList.toggle("active");

        var content = this.nextElementSibling;

        if (content.style.maxHeight) {
            content.style.maxHeight = null;
        } else {
            content.style.maxHeight = content.scrollHeight + "px";
        }

    });
}

function sendButton() {
    var rawText = $("#textInput").val();
    var userHtml = '<p class="userText"><span>' + rawText + "</span></p>";
    $("#textInput").val("");
    $("#chatbox").append(userHtml);
    document.getElementById("chat-bar-bottom").scrollIntoView(true);
    $.ajax({
        url: "/api/chatbot",
        type: "post",
        data: {
            msg: rawText,
        },
    }).done(function (data) {
        var botHtml = '<p class="botText"><span>' + data + '</span></p>';
        $("#chatbox").append($.parseHTML(botHtml));
        document.getElementById("chat-bar-bottom").scrollIntoView(true);
    });
}

// Press enter to send a message
$("#textInput").keypress(function (e) {
    if (e.which == 13) {
        sendButton();
    }
});
