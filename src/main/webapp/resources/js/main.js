$('document').ready(function(){
    var yt=$('#ytlinkimg');
    var da=$('#dalinkimg');
    $('#ytlink').hover(function(){
        yt.fadeOut(0, function(){
            yt.attr("src", "javax.faces.resource/youtubelogored.png.xhtml?ln=img").fadeIn(0);
        });
    }, function(){
        yt.fadeOut(0, function(){
            yt.attr("src", "javax.faces.resource/youtubelogo.png.xhtml?ln=img").fadeIn(0);
        });
    });
    
    $('#dalink').hover(function(){
        da.fadeOut(0, function(){
            da.attr("src", "assets/img/deviantartlogocolor.png").fadeIn(0);
        });
    }, function(){
        da.fadeOut(0, function(){
            da.attr("src", "assets/img/deviantartlogo.png").fadeIn(0);
        });
    });

});