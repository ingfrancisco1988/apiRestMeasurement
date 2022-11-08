package ar.com.repo.APIrest.mapper;

public abstract class AbstractMapper<D,T> {

    public abstract D toDto(T entity);
    public abstract T toEntity(D dto);
}
