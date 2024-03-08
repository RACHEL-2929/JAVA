package movie;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];//2개의 배열로 생성

        MovieReview movieReview1 = new MovieReview();//movieReview1생성
        movieReview1.title = "오만과편견";//영화제목 넣기
        movieReview1.review = "주기적으로 봐줘야 하는 영화";//리뷰 넣기
        reviews[0] = movieReview1;//movieReview1의 참조값을 review[0]에 넣기

        MovieReview movieReview2 = new MovieReview();//movieReview1생성
        movieReview2.title = "웡카";//영화제목 넣기
        movieReview2.review = "움파룸파";//리뷰 넣기
        reviews[1] = movieReview2;//movieReview1의 참조값을 review[0]에 넣기


        for (MovieReview mR: reviews) {
            System.out.println("영화 제목: " + mR.title + ", 리뷰:" + mR.review);

        }
        //반복문을 사용해서 저장된 값들 출력하기 reviews에 저장된 개수만큼
    }
}
