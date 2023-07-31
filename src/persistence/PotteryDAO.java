package persistence;

import java.util.List;

import domain.model.Pottery;

public class PotteryDAO implements DAO<Pottery> {

    PotteryJdbcGateway potteryJdbcGateway;

    public PotteryDAO(PotteryJdbcGateway potteryJdbcGateway) {
    }

    @Override
    public int add(Pottery t) {
        return potteryJdbcGateway.add(t);
    }

    @Override
    public int update(Pottery t) {
        return potteryJdbcGateway.update(t);
    }

    @Override
    public int delete(Pottery t) {
        return potteryJdbcGateway.delete(t);
    }

    @Override
    public List<Pottery> selectAll() {
        return potteryJdbcGateway.selectAll();
    }

}
