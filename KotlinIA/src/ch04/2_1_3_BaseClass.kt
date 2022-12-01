package ch04.baseclass

open class User(val nickname: String){}
class TwitterUser(nickname:String) :User(nickname){}//기반 클래스의 생상자 호출

open class Button
class RadioButton : Button()//기반 클래스의 생성자 호출

