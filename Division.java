
public class Division {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//�����ַ���
		String str="192.168.0.1";
		//���ա�.�����зָʹ��ת���ַ���\\.��
		String[] firstArray=str.split("\\.");
		//���ա�.���������ηָʹ��ת���ַ���\\.��
		String[] secondArray=str.split("\\.",2);
		//���strԭֵ
		System.out.println("str��ԭֵΪ��["+str+"]");
		//���ȫ���ָ���
		System.out.print("ȫ���ָ�Ľ����");
		for(String a:firstArray) {//foreach��䣬����firstArray
			System.out.print("["+a+"]");
		}
		System.out.println();//����
		//����ָ����εĽ��
		System.out.print("����ָ����εĽ����");
		for(String a:secondArray) {
			System.out.print("["+a+"]");
		}
		System.out.println();
	}
}
