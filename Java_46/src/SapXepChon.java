public class SapXepChon implements SapXepInterface {

	@Override
	public void sapXepTang(double[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arr.length; i++)
		{
			int minIndex = i;
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[j] < arr[minIndex])
					minIndex = j;
			}
			if(minIndex != i)
			{
				double temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}

	@Override
	public void sapXepGiam(double[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arr.length; i++)
		{
			int maxIndex = i;
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[j] > arr[maxIndex])
					maxIndex = j;
			}
			if(maxIndex != i)
			{
				double temp = arr[i];
				arr[i] = arr[maxIndex];
				arr[maxIndex] = temp;
			}
		}
	}
	
}
