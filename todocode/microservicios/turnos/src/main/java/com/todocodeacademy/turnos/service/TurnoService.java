package com.todocodeacademy.turnos.service;
import com.todocodeacademy.turnos.model.Turno;
import com.todocodeacademy.turnos.repository.ITurnoRepository;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurnoService implements ITurnoService{
    
    @Autowired
    private ITurnoRepository turnoRepo;

    @Override
    public List<Turno> getTurnos() {
        return turnoRepo.findAll();
    }

    @Override
    public void saveTurno(String fecha, String tratamiento, String dniPaciente) {
        
        //buscar el paciente en la api pacientes
        //Paciente pac = //buscar en la api
        //String nombreCompletoPaciente = //lo que consumo de nombre de la api;
        
        Turno turno = new Turno();
        turno.setFecha(fecha);
        turno.setTratamiento(tratamiento);
        //turno.setNombreCompletoPaciente();
        
        turnoRepo.save(turno);
        
        
    }

    @Override
    public void deleteTurno(Long id) {
        turnoRepo.deleteById(id);
    }

    @Override
    public Turno findTurno(Long id) {
        return turnoRepo.findById(id).orElse(null);
    }

    @Override
    public void editTurno(Long id, Turno turno) {
       
        Turno turn = this.findTurno(id);
        
        turn.setFecha(turno.getFecha());
        turn.setTratamiento(turno.getTratamiento());
        turn.setNombreCompletoPaciente(turno.getNombreCompletoPaciente());
        
        turnoRepo.save(turn);
    }
    
    
    
    
    
}
