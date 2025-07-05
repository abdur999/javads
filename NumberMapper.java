
// Functional Interface to convert double back to T
public interface NumberMapper<T extends Number> {
    T fromDouble(double value);
}