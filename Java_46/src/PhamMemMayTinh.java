
public class PhamMemMayTinh implements MayTinhBoTuiInterface, SapXepInterface {

	@Override
	public double cong(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public double tru(double a, double b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double nhan(double a, double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double chia(double a, double b) {
		// TODO Auto-generated method stub
		return a / b;
	}

	@Override
	public void sapXepTang(double[] arr) {
		// TODO Auto-generated method stub
		for(int i = 1; i < arr.length; i++)
		{
			double value = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > value)
			{
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = value;
		}								
		
	}

	@Override
	public void sapXepGiam(double[] arr) {
		// TODO Auto-generated method stub
		for(int i = 1; i < arr.length; i++)
		{
			double value = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] < value)
			{
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = value;
		}		
	}
	
}
