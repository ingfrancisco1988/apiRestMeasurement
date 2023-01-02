package ar.com.repo.APIrest.mapper;

import ar.com.repo.APIrest.dto.UserDTO;
import ar.com.repo.APIrest.model.CellPhone;
import ar.com.repo.APIrest.model.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component("userMapper")
public class UserMapper extends AbstractMapper<UserDTO, User>{

    @Override
    public UserDTO toDto(User entity) {
        UserDTO dto = new UserDTO();
        dto.setId(entity.getId());
        dto.setUserEmail(entity.getEmail());
        dto.setUserFirstName(entity.getUserFirstName());
        dto.setUserLastName(entity.getUserLastName());
        dto.setCellPhoneList(new ArrayList<>(entity.getCellphoneList()));

        return dto;
    }

    @Override
    public User toEntity(UserDTO dto) {

        User entity = new User();
        if (dto.getId() != 0) entity.setId(dto.getId());
        entity.setEmail(dto.getUserEmail());
        entity.setUserFirstName(dto.getUserFirstName());
        entity.setUserLastName(dto.getUserLastName());
        entity.setCellphoneList(new HashSet<>(dto.getCellPhoneList()));
        return entity;
    }
}
