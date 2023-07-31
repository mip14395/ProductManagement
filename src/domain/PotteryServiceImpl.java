package domain;

import java.util.List;

import domain.model.Pottery;
import persistence.PotteryDAO;
import persistence.PotteryJdbcGateway;

public class PotteryServiceImpl implements Service<Pottery> {

    PotteryDAO potteryDAO;

    public PotteryServiceImpl() {
        this.potteryDAO = new PotteryDAO(new PotteryJdbcGateway());
    }

    @Override
    public int add(Pottery t) {
        return potteryDAO.add(t);
    }

    @Override
    public int update(Pottery t) {
        return potteryDAO.update(t);
    }

    @Override
    public int delete(Pottery t) {
        return potteryDAO.delete(t);
    }

    @Override
    public List<Pottery> selectAll() {
        return potteryDAO.selectAll();
    }

}
