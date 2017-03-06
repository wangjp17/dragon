package com.tianshouzhi.dragon.sharding.route;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 每个逻辑表 管理了 物理表 ，每个物理表 对应一个读写分离数据源编号
 */
public class LogicTable extends LogicConfig{
    private LogicDatabase logicDatabase;
    private Set<String> dbTbShardColumns;

    public LogicTable(String namePattern, List<String> routeRuleStrList,LogicDatabase logicDatabase) {
        super(namePattern, routeRuleStrList);
        if(logicDatabase==null){
            throw new NullPointerException();
        }
        this.logicDatabase=logicDatabase;
        dbTbShardColumns=new HashSet<String>();
        dbTbShardColumns.addAll(logicDatabase.getMergedShardColumns()) ;
        dbTbShardColumns.addAll(this.getMergedShardColumns());
    }
    public String getRouteDBIndex(Map<String,String> shardColumnValuesMap){
        return logicDatabase.getRouteIndex(shardColumnValuesMap);
    }

    public String getRouteTBIndex(Map<String,String> shardColumnValuesMap){
        return getRouteIndex(shardColumnValuesMap);
    }

    /**
     * 将dbrule中指定的所有分区字段、tbrule中指定的所有分区字段合并在一起
     * @return
     */
    public Set<String> getDbTbShardColumns() {
        return dbTbShardColumns;
    }
}
