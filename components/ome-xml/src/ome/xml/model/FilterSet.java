/*
 * #%L
 * OME-XML Java library for working with OME-XML metadata structures.
 * %%
 * Copyright (C) 2006 - 2012 Open Microscopy Environment:
 *   - Massachusetts Institute of Technology
 *   - National Institutes of Health
 *   - University of Dundee
 *   - Board of Regents of the University of Wisconsin-Madison
 *   - Glencoe Software, Inc.
 * %%
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * 1. Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * 
 * The views and conclusions contained in the software and documentation are
 * those of the authors and should not be interpreted as representing official
 * policies, either expressed or implied, of any organization.
 * #L%
 */

/*-----------------------------------------------------------------------------
 *
 * THIS IS AUTOMATICALLY GENERATED CODE.  DO NOT MODIFY.
 * Created by melissa via xsd-fu on 2012-01-12 20:06:01-0500
 *
 *-----------------------------------------------------------------------------
 */

package ome.xml.model;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ome.xml.model.enums.*;
import ome.xml.model.primitives.*;

public class FilterSet extends ManufacturerSpec
{
	// Base: ManufacturerSpec -- Name: FilterSet -- Type: FilterSet -- javaBase: ManufacturerSpec -- javaType: Object

	// -- Constants --

	public static final String NAMESPACE = "http://www.openmicroscopy.org/Schemas/OME/2011-06";

	/** Logger for this class. */
	private static final Logger LOGGER =
		LoggerFactory.getLogger(FilterSet.class);

	// -- Instance variables --


	// Property
	private String id;

	// Reference ExcitationFilterRef
	private List<Filter> excitationFilterList = new ArrayList<Filter>();

	// Property
	private Dichroic dichroic;

	// Reference EmissionFilterRef
	private List<Filter> emissionFilterList = new ArrayList<Filter>();

	// Back reference Channel_BackReference
	private List<Channel> channel_BackReferenceList = new ArrayList<Channel>();

	// Back reference OTF_BackReference
	private List<OTF> otf_backReferenceList = new ArrayList<OTF>();

	// -- Constructors --

	/** Default constructor. */
	public FilterSet()
	{
		super();
	}

	/** 
	 * Constructs FilterSet recursively from an XML DOM tree.
	 * @param element Root of the XML DOM tree to construct a model object
	 * graph from.
	 * @param model Handler for the OME model which keeps track of instances
	 * and references seen during object population.
	 * @throws EnumerationException If there is an error instantiating an
	 * enumeration during model object creation.
	 */
	public FilterSet(Element element, OMEModel model)
	    throws EnumerationException
	{
		update(element, model);
	}

	// -- Custom content from FilterSet specific template --


	// -- OMEModelObject API methods --

	/** 
	 * Updates FilterSet recursively from an XML DOM tree. <b>NOTE:</b> No
	 * properties are removed, only added or updated.
	 * @param element Root of the XML DOM tree to construct a model object
	 * graph from.
	 * @param model Handler for the OME model which keeps track of instances
	 * and references seen during object population.
	 * @throws EnumerationException If there is an error instantiating an
	 * enumeration during model object creation.
	 */
	public void update(Element element, OMEModel model)
	    throws EnumerationException
	{
		super.update(element, model);
		String tagName = element.getTagName();
		if (!"FilterSet".equals(tagName))
		{
			LOGGER.debug("Expecting node name of FilterSet got {}", tagName);
		}
		if (!element.hasAttribute("ID") && getID() == null)
		{
			// TODO: Should be its own exception
			throw new RuntimeException(String.format(
					"FilterSet missing required ID property."));
		}
		if (element.hasAttribute("ID"))
		{
			// ID property
			setID(String.valueOf(
						element.getAttribute("ID")));
			// Adding this model object to the model handler
			model.addModelObject(getID(), this);
		}
		// Element reference ExcitationFilterRef
		List<Element> ExcitationFilterRef_nodeList =
				getChildrenByTagName(element, "ExcitationFilterRef");
		for (Element ExcitationFilterRef_element : ExcitationFilterRef_nodeList)
		{
			ExcitationFilterRef excitationFilterList_reference = new ExcitationFilterRef();
			excitationFilterList_reference.setID(ExcitationFilterRef_element.getAttribute("ID"));
			model.addReference(this, excitationFilterList_reference);
		}
		// Element reference DichroicRef
		List<Element> DichroicRef_nodeList =
				getChildrenByTagName(element, "DichroicRef");
		for (Element DichroicRef_element : DichroicRef_nodeList)
		{
			DichroicRef dichroic_reference = new DichroicRef();
			dichroic_reference.setID(DichroicRef_element.getAttribute("ID"));
			model.addReference(this, dichroic_reference);
		}
		// Element reference EmissionFilterRef
		List<Element> EmissionFilterRef_nodeList =
				getChildrenByTagName(element, "EmissionFilterRef");
		for (Element EmissionFilterRef_element : EmissionFilterRef_nodeList)
		{
			EmissionFilterRef emissionFilterList_reference = new EmissionFilterRef();
			emissionFilterList_reference.setID(EmissionFilterRef_element.getAttribute("ID"));
			model.addReference(this, emissionFilterList_reference);
		}
		// *** IGNORING *** Skipped back reference Channel_BackReference
		// *** IGNORING *** Skipped back reference OTF_BackReference
	}

	// -- FilterSet API methods --

	public boolean link(Reference reference, OMEModelObject o)
	{
		boolean wasHandledBySuperClass = super.link(reference, o);
		if (wasHandledBySuperClass)
		{
			return true;
		}
		if (reference instanceof ExcitationFilterRef)
		{
			Filter o_casted = (Filter) o;
			o_casted.linkFilterSet(this);
			if (!excitationFilterList.contains(o_casted)) {
				excitationFilterList.add(o_casted);
			}
			return true;
		}
		if (reference instanceof DichroicRef)
		{
			Dichroic o_casted = (Dichroic) o;
			o_casted.linkFilterSet(this);
			dichroic = o_casted;
			return true;
		}
		if (reference instanceof EmissionFilterRef)
		{
			Filter o_casted = (Filter) o;
			o_casted.linkFilterSet(this);
			if (!emissionFilterList.contains(o_casted)) {
				emissionFilterList.add(o_casted);
			}
			return true;
		}
		LOGGER.debug("Unable to handle reference of type: {}", reference.getClass());
		return false;
	}


	// Property
	public String getID()
	{
		return id;
	}

	public void setID(String id)
	{
		this.id = id;
	}

	// Reference which occurs more than once
	public int sizeOfLinkedExcitationFilterList()
	{
		return excitationFilterList.size();
	}

	public List<Filter> copyLinkedExcitationFilterList()
	{
		return new ArrayList<Filter>(excitationFilterList);
	}

	public Filter getLinkedExcitationFilter(int index)
	{
		return excitationFilterList.get(index);
	}

	public Filter setLinkedExcitationFilter(int index, Filter o)
	{
		return excitationFilterList.set(index, o);
	}

	public boolean linkExcitationFilter(Filter o)
	{
		o.linkFilterSet(this);
		if (!excitationFilterList.contains(o)) {
			return excitationFilterList.add(o);
		}
		return false;
	}

	public boolean unlinkExcitationFilter(Filter o)
	{
		o.unlinkFilterSet(this);
		return excitationFilterList.remove(o);
	}

	// Reference
	public Dichroic getLinkedDichroic()
	{
		return dichroic;
	}

	public void linkDichroic(Dichroic o)
	{
		dichroic = o;
	}

	public void unlinkDichroic(Dichroic o)
	{
		if (dichroic == o)
		{
			dichroic = null;
		}
	}

	// Reference which occurs more than once
	public int sizeOfLinkedEmissionFilterList()
	{
		return emissionFilterList.size();
	}

	public List<Filter> copyLinkedEmissionFilterList()
	{
		return new ArrayList<Filter>(emissionFilterList);
	}

	public Filter getLinkedEmissionFilter(int index)
	{
		return emissionFilterList.get(index);
	}

	public Filter setLinkedEmissionFilter(int index, Filter o)
	{
		return emissionFilterList.set(index, o);
	}

	public boolean linkEmissionFilter(Filter o)
	{
		o.linkFilterSet(this);
		if (!emissionFilterList.contains(o)) {
			return emissionFilterList.add(o);
		}
		return false;
	}

	public boolean unlinkEmissionFilter(Filter o)
	{
		o.unlinkFilterSet(this);
		return emissionFilterList.remove(o);
	}

	// Reference which occurs more than once
	public int sizeOfLinkedChannelList()
	{
		return channel_BackReferenceList.size();
	}

	public List<Channel> copyLinkedChannelList()
	{
		return new ArrayList<Channel>(channel_BackReferenceList);
	}

	public Channel getLinkedChannel(int index)
	{
		return channel_BackReferenceList.get(index);
	}

	public Channel setLinkedChannel(int index, Channel o)
	{
		return channel_BackReferenceList.set(index, o);
	}

	public boolean linkChannel(Channel o)
	{
		if (!channel_BackReferenceList.contains(o)) {
			return channel_BackReferenceList.add(o);
		}
		return false;
	}

	public boolean unlinkChannel(Channel o)
	{
		return channel_BackReferenceList.remove(o);
	}

	// Reference which occurs more than once
	public int sizeOfLinkedOTFList()
	{
		return otf_backReferenceList.size();
	}

	public List<OTF> copyLinkedOTFList()
	{
		return new ArrayList<OTF>(otf_backReferenceList);
	}

	public OTF getLinkedOTF(int index)
	{
		return otf_backReferenceList.get(index);
	}

	public OTF setLinkedOTF(int index, OTF o)
	{
		return otf_backReferenceList.set(index, o);
	}

	public boolean linkOTF(OTF o)
	{
		if (!otf_backReferenceList.contains(o)) {
			return otf_backReferenceList.add(o);
		}
		return false;
	}

	public boolean unlinkOTF(OTF o)
	{
		return otf_backReferenceList.remove(o);
	}

	public Element asXMLElement(Document document)
	{
		return asXMLElement(document, null);
	}

	protected Element asXMLElement(Document document, Element FilterSet_element)
	{
		// Creating XML block for FilterSet

		if (FilterSet_element == null)
		{
			FilterSet_element =
					document.createElementNS(NAMESPACE, "FilterSet");
		}

		if (id != null)
		{
			// Attribute property ID
			FilterSet_element.setAttribute("ID", id.toString());
		}
		if (excitationFilterList != null)
		{
			// Reference property ExcitationFilterRef which occurs more than once
			for (Filter excitationFilterList_value : excitationFilterList)
			{
				ExcitationFilterRef o = new ExcitationFilterRef();
				o.setID(excitationFilterList_value.getID());
				FilterSet_element.appendChild(o.asXMLElement(document));
			}
		}
		if (dichroic != null)
		{
			// Reference property DichroicRef
			DichroicRef o = new DichroicRef();
			o.setID(dichroic.getID());
			FilterSet_element.appendChild(o.asXMLElement(document));
		}
		if (emissionFilterList != null)
		{
			// Reference property EmissionFilterRef which occurs more than once
			for (Filter emissionFilterList_value : emissionFilterList)
			{
				EmissionFilterRef o = new EmissionFilterRef();
				o.setID(emissionFilterList_value.getID());
				FilterSet_element.appendChild(o.asXMLElement(document));
			}
		}
		if (channel_BackReferenceList != null)
		{
			// *** IGNORING *** Skipped back reference Channel_BackReference
		}
		if (otf_backReferenceList != null)
		{
			// *** IGNORING *** Skipped back reference OTF_BackReference
		}
		return super.asXMLElement(document, FilterSet_element);
	}
}
