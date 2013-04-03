/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class SakilaSalesByFilmCategory extends org.jooq.impl.TableImpl<org.jooq.examples.mysql.sakila.tables.records.SakilaSalesByFilmCategoryRecord> {

	private static final long serialVersionUID = -452327940;

	/**
	 * The singleton instance of <code>sakila.sales_by_film_category</code>
	 */
	public static final org.jooq.examples.mysql.sakila.tables.SakilaSalesByFilmCategory SALES_BY_FILM_CATEGORY = new org.jooq.examples.mysql.sakila.tables.SakilaSalesByFilmCategory();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.SakilaSalesByFilmCategoryRecord> getRecordType() {
		return org.jooq.examples.mysql.sakila.tables.records.SakilaSalesByFilmCategoryRecord.class;
	}

	/**
	 * The column <code>sakila.sales_by_film_category.category</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.SakilaSalesByFilmCategoryRecord, java.lang.String> CATEGORY = createField("category", org.jooq.impl.SQLDataType.VARCHAR.length(25), this);

	/**
	 * The column <code>sakila.sales_by_film_category.total_sales</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.SakilaSalesByFilmCategoryRecord, java.math.BigDecimal> TOTAL_SALES = createField("total_sales", org.jooq.impl.SQLDataType.DECIMAL.precision(27, 2), this);

	/**
	 * Create a <code>sakila.sales_by_film_category</code> table reference
	 */
	public SakilaSalesByFilmCategory() {
		super("sales_by_film_category", org.jooq.examples.mysql.sakila.SakilaSakila.SAKILA);
	}

	/**
	 * Create an aliased <code>sakila.sales_by_film_category</code> table reference
	 */
	public SakilaSalesByFilmCategory(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.SakilaSakila.SAKILA, org.jooq.examples.mysql.sakila.tables.SakilaSalesByFilmCategory.SALES_BY_FILM_CATEGORY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.mysql.sakila.tables.SakilaSalesByFilmCategory as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.SakilaSalesByFilmCategory(alias);
	}
}
