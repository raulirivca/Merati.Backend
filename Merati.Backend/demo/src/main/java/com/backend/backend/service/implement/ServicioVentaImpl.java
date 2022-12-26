package com.backend.backend.service.Implementacion;

import com.backend.backend.dao.VentaDao;
import com.backend.backend.dto.VentaDto;
import com.backend.backend.service.ServicioVenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServicioVentaImpl implements ServicioVenta {
    @Autowired
    VentaDao dao;
    @Override
    public VentaDto obtenerInfoVenta() {
        return dao.obtenerInfoVenta();
    }
}
