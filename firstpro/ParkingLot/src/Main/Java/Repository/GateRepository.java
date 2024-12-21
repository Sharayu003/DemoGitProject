package Main.Java.Repository;

import Main.Java.Exception.GateNotFoundException;
import Main.Java.Models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    //It should do CRUD operations on gate
    Map<Long, Gate>  gates = new HashMap<>();
    public Gate FindGateById(Long id) throws GateNotFoundException {
        if(gates.containsKey(id)){
            return gates.get(id);
        }
        throw new GateNotFoundException();
    }
}
