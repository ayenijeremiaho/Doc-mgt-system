package com.doc.mgt.system.docmgt.user.dto;

import com.doc.mgt.system.docmgt.department.dto.DepartmentDTO;
import com.doc.mgt.system.docmgt.role.dto.RoleDTO;
import lombok.Data;

@Data
public class AdminUserDTO {

    private Long id;

    private String username;

    private String email;

    private RoleDTO role;

    private DepartmentDTO departmentDTO;

//    private String imageUrl;
//
//    private String fileId;

}
