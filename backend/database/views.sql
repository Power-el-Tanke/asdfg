CREATE IF NOT EXISTS MATERIALIZED VIEW adoptable AS
    SELECT * FROM animals 
    WHERE status = 'AVARIABLE'
    ORDER_BY entry_day;