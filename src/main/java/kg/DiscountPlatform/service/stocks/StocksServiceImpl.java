package kg.DiscountPlatform.service.stocks;

import kg.DiscountPlatform.entity.Stocks;
import kg.DiscountPlatform.repository.StocksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StocksServiceImpl implements StocksService {
    @Autowired
    private StocksRepository stocksRepository;

    @Override
    public Stocks addStock(Stocks stocks) {
        return stocksRepository.save(stocks);
    }

    @Override
    public void deleteById(Long id) {
        stocksRepository.deleteById(id);
    }

    @Override
    public Stocks changeStock(Stocks stocks) {
        return stocksRepository.save(stocks);
    }

    @Override
    public Stocks findById(Long id) {
        return stocksRepository.findById(id).get();
    }

    @Override
    public List<Stocks> findAllStocksByName(String name) {
        return stocksRepository.findAllStocksByName(name);
    }

    @Override
    public List<Stocks> findAll() {
        return stocksRepository.findAll();
    }
}
