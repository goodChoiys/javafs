
$(function () {

    // 프로그래스바
    let progressState = 0;


    $(window).scroll(function () {
        if ($(this).scrollTop() >= 150) {
            if (progressState === 0) {
                pgBar(0, 95);
                pgBar(1, 85);
                pgBar(2, 75);
                progressState = 1;
                move;
            } else {
                return;
            }
        } else {
            progressState = 0;
        }
    });

    function pgBar(idx, maxCnt) {
        const elem = $('.progress');
        let w = 0;
        const timer = setInterval(activePgBar, 15);
        function activePgBar() {
            if (w >= maxCnt) {
                clearInterval(timer);
            } else {
                w++;
                elem.eq(idx).find('div').css({ width: w + "%" });
                elem.eq(idx).find('div').text(w + "%");
            }
        }
    }

    // /프로그래스바

    // 카운터(스크롤시)

    let counterState = 0;

    const elem = $('#counter span');
    $(window).scroll(function () {
        // 윈도우 스크롤이 150 이상이면
        console.log($(this).scrollTop());
        if ($(this).scrollTop() >= 2150) {
            if (counterState === 0) {
                move(0, 32, 100);
                move(1, 8, 400);
                move(2, 4, 800);
                move(3, 3, 950);
                counterState = 1;
            } else {
                return;
            }
        } else {
            counterState = 0;
        }
    });

    function move(idx, maxCnt, mSec) {
        let num = 0;
        const timer = setInterval(counter, mSec);
        function counter() {
            if (num >= maxCnt) {
                //clearInterval : setInterval을 이용하여 실행중인 반복 종료
                clearInterval(timer);
            } else {
                num++;
                elem.eq(idx).text(`${num}+`);
            }
        }
    }
});
