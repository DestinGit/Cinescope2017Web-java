$(document).ready(function() {
    $('#menu li').click(function(){
        $('#menu').find('li').removeClass('active');
        $(this).addClass('active');
    });
});

