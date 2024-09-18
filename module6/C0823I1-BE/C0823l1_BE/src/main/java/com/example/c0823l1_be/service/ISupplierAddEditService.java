package com.example.c0823l1_be.service;

import com.example.c0823l1_be.dto.SupplierUpdateDto;
import com.example.c0823l1_be.entity.Supplier;

public interface ISupplierAddEditService {
    Boolean saveSupplier(Supplier supplier);
    Boolean updateSupplier(Supplier supplier);

    SupplierUpdateDto findSupplierById(Integer id);
}
