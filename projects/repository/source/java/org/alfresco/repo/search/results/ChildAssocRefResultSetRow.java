/*
 * Created on 08-Jun-2005
 *
 * TODO Comment this class
 * 
 * 
 */
package org.alfresco.repo.search.results;

import java.io.Serializable;
import java.util.Map;

import org.alfresco.repo.search.AbstractResultSetRow;
import org.alfresco.service.cmr.repository.ChildAssociationRef;
import org.alfresco.service.cmr.repository.Path;
import org.alfresco.service.namespace.QName;

public class ChildAssocRefResultSetRow extends AbstractResultSetRow
{
    public ChildAssocRefResultSetRow(ChildAssocRefResultSet resultSet, int index)
    {
        super(resultSet, index);
    }

    public Serializable getValue(Path path)
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException();
    }

    public QName getQName()
    {
        return ((ChildAssocRefResultSet)getResultSet()).getChildAssocRef(getIndex()).getQName();
    }

    @Override
    protected Map<QName, Serializable> getDirectProperties()
    {
        return ((ChildAssocRefResultSet)getResultSet()).getNodeService().getProperties(getNodeRef());
    }

    public ChildAssociationRef getChildAssocRef()
    {
        return ((ChildAssocRefResultSet)getResultSet()).getChildAssocRef(getIndex());
    }

}
