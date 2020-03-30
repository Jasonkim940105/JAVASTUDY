자바에서는 모든 입출력 데이터를 스트림 형태로 주고받는다.
객체를 파일에 저장하거나, 네트워크로 전송하기위해서는 객체를 스트림으로 만드는 작업이 필요하다 ( 직렬화 serialization )
프로그램에 입력된 스트림으로부터 다시 객체를 만들어 내는 작업 ( 역직렬화 deserialization )

객체의 직렬화와 역직렬화 기능은 java.io.ObjectOutputStream 클래스와 java.io.ObjectInputStream 클래스에서 제공


직접 선언한 클래스에 java.io.Serializable 인터페이스를 구현하도록 만들기만 한다고 직렬화 가능 클래스가 될 수 있다고는 말할 수 없으나
대부분 그렇게 직렬화가능 클래스를 선언할 수 있다 (?)
