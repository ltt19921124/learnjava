package Chapter4;

public class TestBreak2 {

	public static void main(String[] args) {
		
		//���ѭ����outer��Ϊ��ʶ��
		outer:
			for (int i = 0; i < 5; i++) {
				//�ڲ�ѭ��
				for (int j = 0; j < 3; j++) {
					System.out.println("i��ֵΪ:" + i + "i��ֵΪ:" + j);
					if (j ==1) {
						//����outer��־��ѭ��
						break outer;
					}
				}
			}
	}

}