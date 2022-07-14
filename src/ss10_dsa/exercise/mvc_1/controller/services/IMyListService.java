package ss10_dsa.exercise.mvc_1.controller.services;

public interface IMyListService<E> {
  void findAll();
  void clear();
  void ensureCapacity();
  boolean add(E e);
  E remove(int index);
  E get(int index);
}
