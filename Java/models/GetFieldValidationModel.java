/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package softheon.enterprise.api.client.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model for the GET Template input parameters.
 */
public class GetFieldValidationModel {
    /**
     * Gets or sets the sort column.
     */
    @JsonProperty(value = "SortColumn")
    private String sortColumn;

    /**
     * Gets or sets the metadata search options.
     */
    @JsonProperty(value = "Metadata")
    private List<GetLookupFieldModel> metadata;

    /**
     * Gets or sets the page number.
     */
    @JsonProperty(value = "Page")
    private Integer page;

    /**
     * Gets or sets the size of the page.
     */
    @JsonProperty(value = "PageSize")
    private Integer pageSize;

    /**
     * Gets or sets the order. Possible values include: 'Unspecified',
     * 'Ascending', 'Descending'.
     */
    @JsonProperty(value = "SortOrder")
    private String sortOrder;

    /**
     * Gets or sets the column to order by.
     */
    @JsonProperty(value = "SortBy")
    private Integer sortBy;

    /**
     * Get the sortColumn value.
     *
     * @return the sortColumn value
     */
    public String sortColumn() {
        return this.sortColumn;
    }

    /**
     * Set the sortColumn value.
     *
     * @param sortColumn the sortColumn value to set
     * @return the GetFieldValidationModel object itself.
     */
    public GetFieldValidationModel withSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
        return this;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value
     */
    public List<GetLookupFieldModel> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set
     * @return the GetFieldValidationModel object itself.
     */
    public GetFieldValidationModel withMetadata(List<GetLookupFieldModel> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the page value.
     *
     * @return the page value
     */
    public Integer page() {
        return this.page;
    }

    /**
     * Set the page value.
     *
     * @param page the page value to set
     * @return the GetFieldValidationModel object itself.
     */
    public GetFieldValidationModel withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * Get the pageSize value.
     *
     * @return the pageSize value
     */
    public Integer pageSize() {
        return this.pageSize;
    }

    /**
     * Set the pageSize value.
     *
     * @param pageSize the pageSize value to set
     * @return the GetFieldValidationModel object itself.
     */
    public GetFieldValidationModel withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Get the sortOrder value.
     *
     * @return the sortOrder value
     */
    public String sortOrder() {
        return this.sortOrder;
    }

    /**
     * Set the sortOrder value.
     *
     * @param sortOrder the sortOrder value to set
     * @return the GetFieldValidationModel object itself.
     */
    public GetFieldValidationModel withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * Get the sortBy value.
     *
     * @return the sortBy value
     */
    public Integer sortBy() {
        return this.sortBy;
    }

    /**
     * Set the sortBy value.
     *
     * @param sortBy the sortBy value to set
     * @return the GetFieldValidationModel object itself.
     */
    public GetFieldValidationModel withSortBy(Integer sortBy) {
        this.sortBy = sortBy;
        return this;
    }

}