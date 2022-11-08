package ar.com.repo.APIrest.mapper;

import ar.com.repo.APIrest.dto.UserDTO;
import ar.com.repo.APIrest.model.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component("userMapper")
public class UserMapper extends AbstractMapper<UserDTO, User>{

    @Override
    public UserDTO toDto(User entity) {
        UserDTO dto = new UserDTO();
        dto.setId(entity.getId());
        dto.setUserEmail(entity.getEmail());
        dto.setUserFirstName(entity.getUserFirstName());
        dto.setUserLastName(entity.getUserLastName());
        dto.setCellPhoneList(entity.getCellphoneList());

        return dto;
    }

    @Override
    public User toEntity(UserDTO dto) {

        User entity = new User();
        if (dto.getId() != Integer.parseInt(null))entity.setId(dto.getId());
        entity.setEmail(dto.getUserEmail());
        entity.setUserFirstName(dto.getUserFirstName());
        entity.setUserLastName(dto.getUserLastName());
        entity.setCellphoneList(dto.getCellPhoneList());
        return entity;
    }
}
