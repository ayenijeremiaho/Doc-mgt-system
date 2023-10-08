package com.doc.mgt.system.docmgt.department.model;

import com.doc.mgt.system.docmgt.department.dto.DepartmentDTO;
import com.doc.mgt.system.docmgt.document.dto.DocumentDTO;
import com.doc.mgt.system.docmgt.document.dto.DocumentTypeDTO;
import com.doc.mgt.system.docmgt.document.model.Document;
import com.doc.mgt.system.docmgt.document.model.DocumentType;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import java.util.Objects;


@Data
@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    public static DepartmentDTO getDeptDTO(Department department) {
        DepartmentDTO departmentDTO = new DepartmentDTO();
        BeanUtils.copyProperties(department, departmentDTO);

        return departmentDTO;
    }
}
