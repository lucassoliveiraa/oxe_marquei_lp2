package Model.Services;

import Model.DAO.CitizenDAO;
import Model.DAO.DAOFactory;
import Model.DAO.PublicAgentDAO;
import Model.Entities.Citizen;
import Model.Entities.PublicAgent;

import java.util.List;

public class PublicAgentService {
    private PublicAgentDAO publicAgentDAO = DAOFactory.createPublicAgentDAO();

    public void insert(PublicAgent publicAgent) {
        //Depois criar verificaçao
        publicAgentDAO.insert(publicAgent);
    }

    public void update(PublicAgent publicAgent) {
        publicAgentDAO.update(publicAgent);
    }
    public void deleteById(PublicAgent publicAgent) {
        publicAgentDAO.deleteById(0);
    }

    public PublicAgent findById() {
        return publicAgentDAO.findById(0);
    }
    public List<PublicAgent> findAll() {
        return publicAgentDAO.findAll();
    }

}
