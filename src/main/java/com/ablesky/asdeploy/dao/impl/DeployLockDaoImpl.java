package com.ablesky.asdeploy.dao.impl;

import org.springframework.stereotype.Repository;

import com.ablesky.asdeploy.dao.IDeployLockDao;
import com.ablesky.asdeploy.dao.base.AbstractHibernateDaoImpl;
import com.ablesky.asdeploy.pojo.DeployLock;

@Repository
public class DeployLockDaoImpl extends AbstractHibernateDaoImpl<DeployLock> implements IDeployLockDao {

}
