package homework;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
