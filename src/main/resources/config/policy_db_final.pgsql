 
SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;



CREATE SEQUENCE public.decision_rule_id
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.decision_rule_id OWNER TO policynbi;


GRANT USAGE, SELECT ON SEQUENCE public.decision_rule_id TO policynbi;

CREATE SEQUENCE public.execution_log_id
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.execution_log_id OWNER TO policynbi;

GRANT USAGE, SELECT ON SEQUENCE public.execution_log_id TO policynbi;

CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;



SET default_tablespace = '';

SET default_with_oids = false;

CREATE TABLE public.tab_decision_rules (
    id bigint NOT NULL,
    action character varying(128),
    action_count integer,
    alternative_action character varying(128),
    asset_type character varying(128),
    created_by character varying(128),
    creation_date timestamp without time zone,
    event_type character varying(128),
    last_update_date timestamp without time zone,
    last_updated_by character varying(128),
    meter_name character varying(128),
    severity character varying(128),
    severity_evaluation character varying(128),
    status character varying(128),
    tenant_name character varying(128),
    time_lapse integer
);

CREATE TABLE public.tab_execution_log (
    id bigint NOT NULL,
    action character varying(128),
    asset_name character varying(128),
    asset_type character varying(128),
    created_by character varying(128),
    creation_date timestamp without time zone,
    engine_id character varying(128),
    event_type character varying(128),
    instance_id character varying(128),
    last_update_date timestamp without time zone,
    last_updated_by character varying(128),
    raw_message_input character varying(2048),
    raw_message_output character varying(2048),
    status character varying(128),
    notes character varying(255)
);


ALTER TABLE ONLY public.tab_decision_rules
    ADD CONSTRAINT tab_decision_rules_pkey PRIMARY KEY (id);

ALTER TABLE ONLY public.tab_execution_log
    ADD CONSTRAINT tab_execution_log_pkey PRIMARY KEY (id);


CREATE INDEX tab_decision_rule_asset_type_index ON public.tab_decision_rules USING btree (asset_type);


CREATE INDEX tab_decision_rule_event_type_index ON public.tab_decision_rules USING btree (event_type);

CREATE INDEX tab_decision_rule_status_index ON public.tab_decision_rules USING btree (status);


CREATE INDEX tab_execution_log_asset_type_index ON public.tab_execution_log USING btree (asset_type);


CREATE INDEX tab_execution_log_creation_date_index ON public.tab_execution_log USING btree (creation_date);


CREATE INDEX tab_execution_log_event_type_index ON public.tab_execution_log USING btree (event_type);


CREATE INDEX tab_execution_log_status_index ON public.tab_execution_log USING btree (status);


REVOKE ALL ON SCHEMA public FROM PUBLIC;
GRANT ALL ON SCHEMA public TO PUBLIC;
GRANT USAGE ON SCHEMA public TO policynbi;
GRANT CONNECT ON DATABASE policy_db TO policynbi;

GRANT USAGE ON SCHEMA public TO policynbi;

GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO policynbi;

GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA public TO policynbi;


REVOKE ALL ON SEQUENCE public.decision_rule_id FROM PUBLIC;
GRANT SELECT,USAGE ON SEQUENCE public.decision_rule_id TO policynbi;

ALTER SEQUENCE public.execution_log_id
    OWNER TO policynbi; 


