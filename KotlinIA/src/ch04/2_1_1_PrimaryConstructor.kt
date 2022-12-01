package ch04.primaryconstructor
//constructor -> 주, 부 생성자 정의시 사용하는 키워드
class user constructor(_nickname: String){//파라미터가 하나만 있는 주 생성자, _는 프로퍼티와 생성자 파라미터를 구분 this.nickname = nickname 으로 사용해도 됨
    val nickname: String
    init {//초기화 블록 시작 - 인스턴스화(클래스의 객체가 생성) 될때 실행되는 초기화 코드, 주 생성자와 함께 사용, 초기화 블록 안에서만 주 생성자 파라미터 참조 가능
        nickname = _nickname
    }
}
//주 생성자 앞에 다른 애노테이션이나 가시성 변경자가 없다면 constructor 생략후
//class user(_nickname: String){
//val nickname = _nickname } 으로 사용해도 됨
