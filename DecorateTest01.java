package cn.io.study3;
/**
 * ʵ�ַŴ����������ķŴ���
 * @author dell
 *
 */

public class DecorateTest01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Person p=new Person();
				p.say();
				
				Amplifier am=new Amplifier(p);
				am.say();
	}
		

}
interface Say{
	void say();
}
class Person implements Say{
	private int voice=10;
	public int getVoice() {
		return voice;
	}

	public void setVoice(int voice) {
		this.voice = voice;
	}
	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("�˵�����Ϊ��"+this.voice);
	}
}
class Amplifier implements Say{
	private Person p=null;
	
	Amplifier(Person p){
		this.p=p;
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("�˵�����Ϊ��"+p.getVoice()*1000);
		System.out.println("����");
	}
	
}
