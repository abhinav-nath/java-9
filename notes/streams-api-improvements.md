# Streams API Improvements in Java 9

* takeWhile
* dropWhile


* Stream.iterate
* Stream.ofNullable


## takeWhile

```java
default Stream<T> takeWhile(Predicate<? super T> predicate)
```

* Similar to `filter` since it returns a `stream` of elements that matches the given `predicate`

HOWEVER

* `takeWhile` takes elements from the `stream` WHILE the `predicate` is true
* When the `predicate` is false then rest of the `stream` is discarded

## dropWhile

```java
default Stream<T> dropeWhile(Predicate<? super T> predicate)
```

* Opposite of `takeWhile`
* Drops elements WHILE the condition is true
* Takes rest of the elements after the first false

### Use takeWhile and dropWhile with ordered streams only!

## iterate

```java
public static<T> Stream<T> iterate(final T seed, final UnaryOperator<T> f)
```