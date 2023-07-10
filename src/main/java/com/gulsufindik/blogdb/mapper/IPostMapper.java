package com.gulsufindik.blogdb.mapper;
import com.gulsufindik.blogdb.dto.PostDTO;
import com.gulsufindik.blogdb.entity.PostEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IPostMapper {
    IPostMapper INSTANCE = Mappers.getMapper(IPostMapper.class);

}