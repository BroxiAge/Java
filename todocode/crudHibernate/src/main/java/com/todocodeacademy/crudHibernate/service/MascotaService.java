package com.todocodeacademy.crudHibernate.service;

import com.todocodeacademy.crudHibernate.model.Mascota;
import com.todocodeacademy.crudHibernate.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements  IMascotaService {

    @Autowired
    IMascotaRepository repoMasco;

    @Override
    public List<Mascota> getMascotas() {

        List<Mascota> listaMascotas = repoMasco.findAll();
        return listaMascotas;
    }

    @Override
    public void saveMascota(Mascota masco) {
        repoMasco.save(masco);
    }

    @Override
    public void deleteMascota(Long id) {
        repoMasco.deleteById(id);
    }

    @Override
    public Mascota findMascota(Long id) {
        Mascota masco = repoMasco.findById(id).orElse(null);
        return masco;
    }

    @Override
    public void editPMascota(Long Original, String nombre, String especie, String raza, String color) {

        Mascota masc = this.findMascota(Original);

        //proceso de modificación a nivel lógico
        masc.setNombre(nombre);
        masc.setEspecie(especie);
        masc.setRaza(raza);
        masc.setColor(color);

        //guardar los cambios
        this.saveMascota(masc);
    }
}
