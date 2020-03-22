package kg.DiscountPlatform.service.stocks;

import kg.DiscountPlatform.entity.Stocks;

import java.util.List;

public interface StocksService {
    Stocks addStock(Stocks stocks);

    void deleteById(Long id);

    Stocks changeStock(Stocks stocks);

    Stocks findById(Long id);

    List<Stocks> findAllStocksByName(String name);

    List<Stocks> findAll();
}
