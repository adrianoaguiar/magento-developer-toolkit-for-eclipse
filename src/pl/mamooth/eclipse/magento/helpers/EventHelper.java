package pl.mamooth.eclipse.magento.helpers;

import java.util.HashSet;

public class EventHelper {

	public static String[] getAviableEvents(String[] eventPrefixes, String[] controllerHandlers, String[] sections) {
		HashSet<String> events = new HashSet<String>();
		for (String event : CUSTOM_EVENTS)
			events.add(event);
		if (sections != null) {
			for (String section : sections) {
				events.add("admin_system_config_changed_section_" + section);
			}
		}
		if (controllerHandlers != null) {
			for (String handler : controllerHandlers) {
				events.add("controller_action_predispatch_" + handler);
				events.add("controller_action_postdispatch_" + handler);
				events.add("controller_action_layout_render_before_" + handler);
			}
		}
		if (eventPrefixes != null) {
			for (String prefix : eventPrefixes) {
				events.add(prefix + "_load_before");
				events.add(prefix + "_load_after");
				events.add(prefix + "_save_commit_after");
				events.add(prefix + "_save_before");
				events.add(prefix + "_save_after");
				events.add(prefix + "_delete_before");
				events.add(prefix + "_delete_after");
				events.add(prefix + "_delete_commit_after");
				events.add(prefix + "_clear");
			}
		}
		return events.toArray(new String[] {});
	}

	public final static String[] CUSTOM_EVENTS = { "default", "adminhtml_controller_action_predispatch_start", "adminhtml_block_html_before", "adminhtml_widget_grid_filter_collection", "adminhtml_cms_page_edit_tab_meta_prepare_form", "adminhtml_cms_page_edit_tab_design_prepare_form", "adminhtml_cms_page_edit_tab_main_prepare_form", "adminhtml_cms_page_edit_tab_content_prepare_form", "api_user_html_before", "adminhtml_widget_container_html_before", "permissions_user_html_before", "adminhtml_block_html_before", "adminhtml_customer_orders_add_action_renderer", "adminhtml_catalog_category_tabs", "adminhtml_catalog_category_tree_is_moveable", "adminhtml_catalog_category_tree_can_add_root_category", "adminhtml_catalog_category_tree_can_add_sub_category", "adminhtml_catalog_category_edit_prepare_form", "adminhtml_catalog_product_grid_prepare_massaction", "catalog_product_gallery_prepare_layout", "adminhtml_catalog_product_edit_prepare_form", "adminhtml_catalog_product_edit_element_types", "adminhtml_catalog_product_attribute_set_main_html_before", "adminhtml_catalog_product_attribute_set_toolbar_main_html_before", "adminhtml_product_attribute_types", "adminhtml_catalog_product_attribute_edit_prepare_form", "adminhtml_catalog_product_form_prepare_excluded_field_list", "adminhtml_catalog_product_edit_prepare_form", "adminhtml_catalog_product_edit_element_types", "catalog_product_edit_form_render_recurring", "adminhtml_catalog_product_edit_tab_attributes_create_html_before", "adminhtml_block_promo_widget_chooser_prepare_collection", "adminhtml_promo_catalog_edit_tab_main_prepare_form", "adminhtml_block_salesrule_actions_prepareform", "adminhtml_promo_quote_edit_tab_main_prepare_form", "adminhtml_promo_quote_edit_tab_coupons_form_prepare_form", "adminhtml_system_config_advanced_disableoutput_render_before", "adminhtml_block_system_config_init_tab_sections_before", "adminhtml_store_edit_form_prepare_form", "cms_page_prepare_save", "adminhtml_cmspage_on_delete", "adminhtml_cmspage_on_delete", "adminhtml_cache_flush_all", "adminhtml_cache_flush_system", "adminhtml_cache_refresh_type", "clean_media_cache_after", "clean_catalog_images_cache_after", "admin_permissions_role_prepare_save", "on_view_report", "adminhtml_sales_order_create_process_data_before", "adminhtml_sales_order_create_process_data", "adminhtml_sales_order_creditmemo_register_before", "category_prepare_ajax_response", "catalog_category_prepare_save", "catalog_controller_category_delete", "catalog_product_gallery_upload_image_after", "catalog_product_to_website_change", "catalog_product_new_action", "catalog_product_edit_action", "catalog_product_prepare_save", "catalog_controller_product_delete", "adminhtml_controller_catalogrule_prepare_save", "adminhtml_controller_salesrule_prepare_save", "adminhtml_customer_prepare_save", "adminhtml_customer_save_after", "add_synchronize_message", "admin_system_config_section_save_after", "store_group_save", "store_delete", "model_config_data_save_before", "sales_convert_order_to_quote", "sales_convert_order_item_to_quote_item", "checkout_submit_all_after", "googlecheckout_block_link_html_before", "googlecheckout_checkout_before", "google_checkout_discount_item_price", "googlecheckout_create_order_before", "googlecheckout_save_order_after", "checkout_submit_all_after", "rss_wishlist_xml_callback", "rss_order_new_collection_select", "rss_catalog_review_collection_select", "rss_catalog_tagged_item_xml_callback", "rss_catalog_notify_stock_collection_select", "rss_catalog_category_xml_callback", "rss_catalog_new_xml_callback", "rss_catalog_special_xml_callback", "customer_register_success", "customer_registration_is_allowed", "customer_address_format", "customer_session_init", "customer_login", "customer_logout", "customer_customer_authenticated", "paypal_prepare_line_items", "tax_settings_change_after", "tax_settings_change_after", "tax_settings_change_after", "tax_settings_change_after", "tax_settings_change_after", "tax_rate_data_fetch", "product_option_renderer_init", "wishlist_add_product", "wishlist_update_item", "wishlist_share", "wishlist_items_renewed", "wishlist_item_collection_products_after_load", "wishlist_add_item", "wishlist_product_add_after", "admin_user_authenticate_before", "admin_user_authenticate_after", "admin_session_user_login_success", "admin_session_user_login_failed", "cms_controller_router_match_before", "cms_wysiwyg_images_static_urls_allowed", "cms_page_render", "cms_wysiwyg_config_prepare", "cms_page_get_available_statuses", "persistent_session_expired", "persistent_session_expired", "controller_action_layout_load_before", "controller_action_layout_generate_xml_before", "controller_action_layout_generate_blocks_before", "controller_action_layout_generate_blocks_after", "controller_action_layout_render_before", "controller_action_predispatch", "controller_action_postdispatch", "controller_action_noroute", "controller_action_nocookies", "controller_front_init_before", "controller_front_init_routers", "controller_front_send_response_before", "controller_front_send_response_after", "http_response_send_before", "controller_response_redirect", "core_block_abstract_prepare_layout_before", "core_block_abstract_to_html_before", "core_block_abstract_to_html_after", "core_layout_block_create_after", "core_collection_abstract_load_before", "core_collection_abstract_load_after", "core_session_abstract_clear_messages", "core_session_abstract_add_message", "application_clean_cache", "core_layout_update_updates_get_after", "core_clean_cache", "model_load_before", "model_load_after", "model_save_commit_after", "model_save_before", "model_save_after", "model_delete_before", "model_delete_after", "model_delete_commit_after", "core_locale_set_locale", "currency_display_options_forming", "resource_get_tablename", "api_user_authenticated", "poll_vote_add", "checkout_cart_add_product_complete", "enterprise_giftcardaccount_add", "review_controller_product_init_before", "review_controller_product_init", "wishlist_add_product", "checkout_controller_onepage_save_shipping_method", "checkout_controller_onepage_save_shipping_method", "before_save_message_queue", "catalogindex_prepare_price_select", "catalogindex_prepare_price_select", "catalogindex_prepare_price_select", "catalogindex_prepare_price_select", "catalogindex_plain_reindex_after", "catalogindex_prepare_price_select", "catalogindex_get_minimal_price", "index_process_change_status", "admin_system_config_changed_section_currency_before_reinit", "admin_system_config_changed_section_currency", "review_controller_product_init_before", "review_controller_product_init", "review_review_collection_load_before", "gift_options_prepare_items", "checkout_controller_onepage_save_shipping_method", "checkout_controller_onepage_save_shipping_method", "payment_form_block_to_html_before", "payment_info_block_prepare_specific_information", "payment_method_is_active", "catalogrule_before_apply", "catalogrule_after_apply", "salesrule_validator_process", "salesrule_rule_get_coupon_types", "salesrule_rule_condition_combine", "sales_quote_address_discount_item", "sales_quote_address_discount_item", "prepare_catalog_product_collection_prices", "sales_quote_item_collection_products_after_load", "sales_sale_collection_query_before", "sales_convert_quote_to_order", "sales_convert_quote_address_to_order", "sales_convert_quote_address_to_order_address", "sales_convert_quote_payment_to_order_payment", "sales_convert_quote_item_to_order_item", "sales_convert_order_to_quote", "sales_quote_remove_item", "sales_quote_add_item", "sales_quote_product_add_after", "checkout_type_onepage_save_order", "sales_model_service_quote_submit_success", "sales_model_service_quote_submit_failure", "sales_model_service_quote_submit_after", "sales_order_place_before", "order_cancel_after", "sales_order_payment_place_start", "sales_order_payment_place_end", "sales_order_payment_capture", "sales_order_payment_pay", "sales_order_payment_cancel_invoice", "sales_order_payment_void", "sales_order_payment_refund", "sales_order_payment_cancel_creditmemo", "sales_order_payment_cancel", "sales_order_invoice_pay", "sales_order_invoice_cancel", "sales_order_invoice_register", "sales_order_item_cancel", "sales_order_creditmemo_refund", "sales_order_creditmemo_cancel", "sales_quote_item_qty_set_after", "sales_quote_item_set_product", "sales_quote_address_discount_item", "sales_quote_address_discount_item", "sales_quote_config_get_product_attributes", "clear_expired_quotes_before", "checkout_controller_multishipping_shipping_post", "checkout_multishipping_controller_success_action", "checkout_cart_add_product_complete", "checkout_cart_update_item_complete", "checkout_onepage_controller_success_action", "checkout_controller_onepage_save_shipping_method", "checkout_allow_guest", "checkout_cart_product_add_after", "checkout_cart_update_items_before", "checkout_cart_update_items_after", "checkout_cart_save_before", "checkout_cart_save_after", "checkout_cart_product_update_after", "custom_quote_process", "checkout_quote_init", "load_customer_quote_before", "checkout_quote_destroy", "checkout_type_onepage_save_order_after", "checkout_submit_all_after", "checkout_type_onepage_save_order_after", "checkout_submit_all_after", "checkout_type_multishipping_set_shipping_items", "checkout_type_multishipping_create_orders_single", "checkout_submit_all_after", "checkout_multishipping_refund_all", "sendfriend_product", "catalog_product_view_config", "catalog_block_product_list_collection", "catalog_product_upsell", "catalog_product_type_configurable_price", "catalog_controller_category_init_before", "catalog_controller_category_init_after", "catalog_product_compare_add_product", "catalog_product_compare_remove_product", "catalog_helper_output_construct", "catalog_controller_product_view", "catalog_controller_product_init_before", "catalog_controller_product_init", "catalogindex_prepare_price_select", "catalog_prepare_price_select",
			"catalog_category_tree_init_inactive_category_ids", "catalog_category_tree_move_before", "catalog_category_tree_move_after", "catalog_category_tree_init_inactive_category_ids", "catalog_category_flat_loadnodes_before", "catalog_category_change_products", "catalog_product_flat_prepare_columns", "catalog_product_flat_prepare_indexes", "catalog_product_flat_rebuild", "catalog_product_flat_update_product", "catalog_product_prepare_index_select", "prepare_catalog_product_index_select", "prepare_catalog_product_price_index_table", "prepare_catalog_product_index_select", "prepare_catalog_product_index_select", "prepare_catalog_product_index_select", "prepare_catalog_product_index_select", "catalog_product_compare_item_collection_clear", "catalog_prepare_price_select", "catalog_product_collection_load_before", "catalog_product_collection_load_after", "catalog_product_collection_before_add_count_to_categories", "catalog_product_collection_apply_limitations_after", "catalog_category_tree_move_before", "category_move", "catalog_product_attribute_update_before", "catalog_product_website_update_before", "catalog_product_website_update", "catalog_product_prepare_save", "catalog_product_media_save_before", "catalog_product_media_add_image", "adminhtml_product_attribute_types", "catalog_product_get_final_price", "catalog_product_type_grouped_price", "catalog_product_get_final_price", "catalog_product_type_configurable_price", "catalog_product_status_update", "catalog_model_product_duplicate", "catalog_product_is_salable_before", "catalog_product_is_salable_after", "controller_action_postdispatch_adminhtml", "page_block_html_topmenu_gethtml_before", "page_block_html_topmenu_gethtml_after", "log_visitor_collection_load_before", "log_log_clean_before", "log_log_clean_after", "visitor_init", "rule_environment_collect", "adminhtml_block_eav_attribute_edit_form_init", "eav_collection_abstract_load_before", "catalog_product_import_finish_before", "catalog_prepare_price_select", "catalogsearch_reset_search_result", "catelogsearch_searchable_attributes_load_after", "catalogsearch_index_process_start", "catalogsearch_index_process_complete", "bundle_product_view_config", "catalog_product_prepare_index_select", "catalog_product_prepare_index_select", "prepare_catalog_product_price_index_table", "prepare_catalog_product_collection_prices", "catalog_product_get_final_price", "catalog_product_get_final_price", "prepare_catalog_product_index_select", };
}