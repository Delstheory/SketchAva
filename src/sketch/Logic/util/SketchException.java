package sketch.Logic.util;

public class SketchException {

    public static class ThrowNewException {

        public static void UnsupportedValueException(String reason, String methodPath, int methodLineNum) {
            exceptionCaught("UnsupportedValue", reason, methodPath, methodLineNum);
        }

        public static void UnknownValueException(String reason, String methodPath, int methodLineNum) {
            exceptionCaught("UnknownValue", reason, methodPath, methodLineNum);
        }
    }

    public static void exceptionCaught(String exc, String reason, String path, int methodLine) {
        String begin = "sketch.Logic.util.SketchException has thrown ";
        System.out.println(begin + exc);
        System.out.println("at: \r\n " + path + "\r\n" + "Line " + methodLine + "\r\n Reason: \r\n " + reason);
        System.out.println(path);
        System.out.println("Line " + methodLine);
        System.out.println("Reason: ");
        System.out.println(reason);
    }
}
