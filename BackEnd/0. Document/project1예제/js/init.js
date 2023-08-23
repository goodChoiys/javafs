$(function () {
    var imgs = '';
    //변수 초기화
    //이미지 200개를 section에 넣기
    for (var i = 0; i <= 200; i++) {
        imgs = imgs + "<img src='images/pic" + i + ".jpg'>"

    }
    //console.log(imgs);
    $('section').html(imgs);

    //마우스 움직일때마다
    $('body').mousemove(function (e) {
        var $width = $(window).width();
        // console.log($width); - 1920

        var $posX = e.pageX; // 화면에서 x좌표 위치
        //console.log($posx)

        var $percent = Math.floor(($posX / $width)*200);
        // 예를들어 x축 100 만큼 이동
        // 전체 저니 1920 (100/1920) + 200 = 10.41666 ->10
        $('section > img').hide();
        $('section > img').eq($percent).show();
        // 화면너비를 이미지 갯수만큼 나눠서 마우스 움직인 위치에 맞는 이미지를 선택이 가능하도록 해줌
    })

});












