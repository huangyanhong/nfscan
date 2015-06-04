package cc.nfscan.server.domain;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.util.Date;

/**
 * Entity class that represents TaxReceipt on database
 *
 * @author Marcelo Carlos Agostinho Junior <a href="http://github.com/magostinhojr">@magostinhojr</a>
 */
@DynamoDBTable(tableName = "NFSCAN-TAXRECEIPTARCHIVE")
public class TaxReceiptArchive implements IDomain {

    private static final long serialVersionUID = 1L;

    /**
     * identifier
     */
    private String id;

    /**
     * cnpj
     */
    private String cnpj;


    /**
     * date
     */
    private Date date;

    /**
     * COO
     */
    private String coo;

    /**
     * total
     */
    private Double total;

    /**
     * S3 object
     */
    private String s3Object;

    /**
     * dateInsertion of this object
     */
    private Date dateInsertion;

    /**
     * dateApproved of this object
     */
    private boolean approved;


    public TaxReceiptArchive() {
    }

    @DynamoDBHashKey(attributeName = "taxreceiptarchive_id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @DynamoDBAttribute(attributeName = "cnpj")
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @DynamoDBAttribute(attributeName = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @DynamoDBAttribute(attributeName = "coo")
    public String getCoo() {
        return coo;
    }

    public void setCoo(String coo) {
        this.coo = coo;
    }

    @DynamoDBAttribute(attributeName = "total")
    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @DynamoDBAttribute(attributeName = "s3Object")
    public String getS3Object() {
        return s3Object;
    }

    public void setS3Object(String s3Object) {
        this.s3Object = s3Object;
    }

    @DynamoDBAttribute(attributeName = "dateInsertion")
    public Date getDateInsertion() {
        return dateInsertion;
    }

    public void setDateInsertion(Date dateInsertion) {
        this.dateInsertion = dateInsertion;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    @Override
    public String toString() {
        return "TaxReceiptArchive{" +
                "id='" + id + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", date=" + date +
                ", coo='" + coo + '\'' +
                ", total=" + total +
                ", s3Object='" + s3Object + '\'' +
                ", dateInsertion=" + dateInsertion +
                ", approved=" + approved +
                '}';
    }
}