package JavaExceptionHandling;

public class getElement{
public int getElement(int[] arr, int index) throws IndexOutOfBoundsException {
    if (index < 0 || index >= arr.length) {
        throw new IndexOutOfBoundsException("Vị trí index không hợp lệ");
    }
    return arr[index];
}
}
