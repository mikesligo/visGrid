package visSync.actions;

import http.Property;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Vector;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import dataTypes.Model;

import threads.EMFThread;
import visGrid.*;

/**
 * Our sample action implements workbench action delegate.
 * The action proxy will be created by the workbench and
 * shown in the UI. When the user tries to use the action,
 * this delegate will be created and execution will be 
 * delegated to it.
 * @see IWorkbenchWindowActionDelegate
 */
public class Sync implements IWorkbenchWindowActionDelegate {
	private IWorkbenchWindow window;

	public Sync() {
	}

	/**
	 * The action has been activated. The argument of the
	 * method represents the 'real' action sitting
	 * in the workbench UI.
	 * @see IWorkbenchWindowActionDelegate#run
	 */
	public void run(IAction action) {

		VisGridFactory factory = VisGridFactory.eINSTANCE;
		Grid grid = factory.createGrid();

		Vector<Model> modules = null;
		try {
			modules = Property.getModuleList();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		for (int i=0;i<modules.size();i++){ 
			String type = modules.get(i).getType();
			String name = modules.get(i).getName();
			// This was generated by a python script located in this directory
			if (type.equals("auction")) {
				Auction auction= factory.createAuction();
				auction.setName(name);
				grid.getConnections().add(auction);
			}
			else if (type.equals("battery")) {
				Battery battery= factory.createBattery();
				battery.setName(name);
				grid.getConnections().add(battery);
			}
			else if (type.equals("billdump")) {
				Billdump billdump= factory.createBilldump();
				billdump.setName(name);
				grid.getConnections().add(billdump);
			}
			else if (type.equals("capacitor")) {
				Capacitor capacitor= factory.createCapacitor();
				capacitor.setName(name);
				grid.getConnections().add(capacitor);
			}
			else if (type.equals("capbank")) {
				Capbank capbank= factory.createCapbank();
				capbank.setName(name);
				grid.getConnections().add(capbank);
			}
			else if (type.equals("climate")) {
				Climate climate= factory.createClimate();
				climate.setName(name);
				grid.getConnections().add(climate);
			}
			else if (type.equals("clotheswasher")) {
				Clotheswasher clotheswasher= factory.createClotheswasher();
				clotheswasher.setName(name);
				grid.getConnections().add(clotheswasher);
			}
			else if (type.equals("collector")) {
				Collector collector= factory.createCollector();
				collector.setName(name);
				grid.getConnections().add(collector);
			}
			else if (type.equals("comm")) {
				Comm comm= factory.createComm();
				comm.setName(name);
				grid.getConnections().add(comm);
			}
			else if (type.equals("controller")) {
				Controller controller= factory.createController();
				controller.setName(name);
				grid.getConnections().add(controller);
			}
			else if (type.equals("controller2")) {
				Controller2 controller2= factory.createController2();
				controller2.setName(name);
				grid.getConnections().add(controller2);
			}
			else if (type.equals("csv_reader")) {
				Csv_reader csv_reader= factory.createCsv_reader();
				csv_reader.setName(name);
				grid.getConnections().add(csv_reader);
			}
			else if (type.equals("dc_dc_converter")) {
				Dc_dc_converter dc_dc_converter= factory.createDc_dc_converter();
				dc_dc_converter.setName(name);
				grid.getConnections().add(dc_dc_converter);
			}
			else if (type.equals("diesel_dg")) {
				Diesel_dg diesel_dg= factory.createDiesel_dg();
				diesel_dg.setName(name);
				grid.getConnections().add(diesel_dg);
			}
			else if (type.equals("dishwasher")) {
				Dishwasher dishwasher= factory.createDishwasher();
				dishwasher.setName(name);
				grid.getConnections().add(dishwasher);
			}
			else if (type.equals("dryer")) {
				Dryer dryer= factory.createDryer();
				dryer.setName(name);
				grid.getConnections().add(dryer);
			}
			else if (type.equals("energy_storage")) {
				Energy_storage energy_storage= factory.createEnergy_storage();
				energy_storage.setName(name);
				grid.getConnections().add(energy_storage);
			}
			else if (type.equals("evcharger")) {
				Evcharger evcharger= factory.createEvcharger();
				evcharger.setName(name);
				grid.getConnections().add(evcharger);
			}
			else if (type.equals("fault_check")) {
				Fault_check fault_check= factory.createFault_check();
				fault_check.setName(name);
				grid.getConnections().add(fault_check);
			}
			else if (type.equals("freezer")) {
				Freezer freezer= factory.createFreezer();
				freezer.setName(name);
				grid.getConnections().add(freezer);
			}
			else if (type.equals("frequency_gen")) {
				Frequency_gen frequency_gen= factory.createFrequency_gen();
				frequency_gen.setName(name);
				grid.getConnections().add(frequency_gen);
			}
			else if (type.equals("fuse")) {
				Fuse fuse= factory.createFuse();
				fuse.setName(name);
				grid.getConnections().add(fuse);
			}
			else if (type.equals("generator")) {
				Generator generator= factory.createGenerator();
				generator.setName(name);
				grid.getConnections().add(generator);
			}
			else if (type.equals("histogram")) {
				Histogram histogram= factory.createHistogram();
				histogram.setName(name);
				grid.getConnections().add(histogram);
			}
			else if (type.equals("house_a")) {
				House_a house_a= factory.createHouse_a();
				house_a.setName(name);
				grid.getConnections().add(house_a);
			}
			else if (type.equals("house")) {
				House house= factory.createHouse();
				house.setName(name);
				grid.getConnections().add(house);
			}
			else if (type.equals("inverter")) {
				Inverter inverter= factory.createInverter();
				inverter.setName(name);
				grid.getConnections().add(inverter);
			}
			else if (type.equals("lights")) {
				Lights lights= factory.createLights();
				lights.setName(name);
				grid.getConnections().add(lights);
			}
			else if (type.equals("line_configuration")) {
				Line_configuration line_configuration= factory.createLine_configuration();
				line_configuration.setName(name);
				grid.getConnections().add(line_configuration);
			}
			else if (type.equals("line_spacing")) {
				Line_spacing line_spacing= factory.createLine_spacing();
				line_spacing.setName(name);
				grid.getConnections().add(line_spacing);
			}
			else if (type.equals("line")) {
				Line line= factory.createLine();
				line.setName(name);
				grid.getConnections().add(line);
			}
			else if (type.equals("link")) {
				Link link= factory.createLink();
				link.setName(name);
				grid.getConnections().add(link);
			}
			else if (type.equals("load")) {
				Load load= factory.createLoad();
				load.setName(name);
				grid.getConnections().add(load);
			}
			else if (type.equals("meter")) {
				Meter meter= factory.createMeter();
				meter.setName(name);
				grid.getConnections().add(meter);
			}
			else if (type.equals("microturbine")) {
				Microturbine microturbine= factory.createMicroturbine();
				microturbine.setName(name);
				grid.getConnections().add(microturbine);
			}
			else if (type.equals("microwave")) {
				Microwave microwave= factory.createMicrowave();
				microwave.setName(name);
				grid.getConnections().add(microwave);
			}
			else if (type.equals("motor")) {
				Motor motor= factory.createMotor();
				motor.setName(name);
				grid.getConnections().add(motor);
			}
			else if (type.equals("multizone")) {
				Multizone multizone= factory.createMultizone();
				multizone.setName(name);
				grid.getConnections().add(multizone);
			}
			else if (type.equals("node")) {
				Node node= factory.createNode();
				node.setName(name);
				grid.getConnections().add(node);
			}
			else if (type.equals("occupantload")) {
				Occupantload occupantload= factory.createOccupantload();
				occupantload.setName(name);
				grid.getConnections().add(occupantload);
			}
			else if (type.equals("office")) {
				Office office= factory.createOffice();
				office.setName(name);
				grid.getConnections().add(office);
			}
			else if (type.equals("overhead_line_conductor")) {
				Overhead_line_conductor overhead_line_conductor= factory.createOverhead_line_conductor();
				overhead_line_conductor.setName(name);
				grid.getConnections().add(overhead_line_conductor);
			}
			else if (type.equals("overhead_line")) {
				Overhead_line overhead_line= factory.createOverhead_line();
				overhead_line.setName(name);
				grid.getConnections().add(overhead_line);
			}
			else if (type.equals("player")) {
				Player player= factory.createPlayer();
				player.setName(name);
				grid.getConnections().add(player);
			}
			else if (type.equals("plc")) {
				Plc plc= factory.createPlc();
				plc.setName(name);
				grid.getConnections().add(plc);
			}
			else if (type.equals("plugload")) {
				Plugload plugload= factory.createPlugload();
				plugload.setName(name);
				grid.getConnections().add(plugload);
			}
			else if (type.equals("power_electronics")) {
				Power_electronics power_electronics= factory.createPower_electronics();
				power_electronics.setName(name);
				grid.getConnections().add(power_electronics);
			}
			else if (type.equals("pqload")) {
				Pqload pqload= factory.createPqload();
				pqload.setName(name);
				grid.getConnections().add(pqload);
			}
			else if (type.equals("range")) {
				Range range= factory.createRange();
				range.setName(name);
				grid.getConnections().add(range);
			}
			else if (type.equals("recorder")) {
				Recorder recorder= factory.createRecorder();
				recorder.setName(name);
				grid.getConnections().add(recorder);
			}
			else if (type.equals("rectifier")) {
				Rectifier rectifier= factory.createRectifier();
				rectifier.setName(name);
				grid.getConnections().add(rectifier);
			}
			else if (type.equals("refrigerator")) {
				Refrigerator refrigerator= factory.createRefrigerator();
				refrigerator.setName(name);
				grid.getConnections().add(refrigerator);
			}
			else if (type.equals("regulator_configuration")) {
				Regulator_configuration regulator_configuration= factory.createRegulator_configuration();
				regulator_configuration.setName(name);
				grid.getConnections().add(regulator_configuration);
			}
			else if (type.equals("regulator")) {
				Regulator regulator= factory.createRegulator();
				regulator.setName(name);
				grid.getConnections().add(regulator);
			}
			else if (type.equals("relay")) {
				Relay relay= factory.createRelay();
				relay.setName(name);
				grid.getConnections().add(relay);
			}
			else if (type.equals("residential_enduse")) {
				Residential_enduse residential_enduse= factory.createResidential_enduse();
				residential_enduse.setName(name);
				grid.getConnections().add(residential_enduse);
			}
			else if (type.equals("restoration")) {
				Restoration restoration= factory.createRestoration();
				restoration.setName(name);
				grid.getConnections().add(restoration);
			}
			else if (type.equals("series_reactor")) {
				Series_reactor series_reactor= factory.createSeries_reactor();
				series_reactor.setName(name);
				grid.getConnections().add(series_reactor);
			}
			else if (type.equals("shaper")) {
				Shaper shaper= factory.createShaper();
				shaper.setName(name);
				grid.getConnections().add(shaper);
			}
			else if (type.equals("solar")) {
				Solar solar= factory.createSolar();
				solar.setName(name);
				grid.getConnections().add(solar);
			}
			else if (type.equals("stubauction")) {
				Stubauction stubauction= factory.createStubauction();
				stubauction.setName(name);
				grid.getConnections().add(stubauction);
			}
			else if (type.equals("substation")) {
				Substation substation= factory.createSubstation();
				substation.setName(name);
				grid.getConnections().add(substation);
			}
			else if (type.equals("switch")) {
				Switch switch1= factory.createSwitch();
				switch1.setName(name);
				grid.getConnections().add(switch1);
			}
			else if (type.equals("transformer_configuration")) {
				Transformer_configuration transformer_configuration= factory.createTransformer_configuration();
				transformer_configuration.setName(name);
				grid.getConnections().add(transformer_configuration);
			}
			else if (type.equals("transformer")) {
				Transformer transformer= factory.createTransformer();
				transformer.setName(name);
				grid.getConnections().add(transformer);
			}
			else if (type.equals("triplex_line_conductor")) {
				Triplex_line_conductor triplex_line_conductor= factory.createTriplex_line_conductor();
				triplex_line_conductor.setName(name);
				grid.getConnections().add(triplex_line_conductor);
			}
			else if (type.equals("triplex_line_configuration")) {
				Triplex_line_configuration triplex_line_configuration= factory.createTriplex_line_configuration();
				triplex_line_configuration.setName(name);
				grid.getConnections().add(triplex_line_configuration);
			}
			else if (type.equals("triplex_line")) {
				Triplex_line triplex_line= factory.createTriplex_line();
				triplex_line.setName(name);
				grid.getConnections().add(triplex_line);
			}
			else if (type.equals("triplex_meter")) {
				Triplex_meter triplex_meter= factory.createTriplex_meter();
				triplex_meter.setName(name);
				grid.getConnections().add(triplex_meter);
			}
			else if (type.equals("triplex_node")) {
				Triplex_node triplex_node= factory.createTriplex_node();
				triplex_node.setName(name);
				grid.getConnections().add(triplex_node);
			}
			else if (type.equals("underground_line_conductor")) {
				Underground_line_conductor underground_line_conductor= factory.createUnderground_line_conductor();
				underground_line_conductor.setName(name);
				grid.getConnections().add(underground_line_conductor);
			}
			else if (type.equals("underground_line")) {
				Underground_line underground_line= factory.createUnderground_line();
				underground_line.setName(name);
				grid.getConnections().add(underground_line);
			}
			else if (type.equals("volt_var_control")) {
				Volt_var_control volt_var_control= factory.createVolt_var_control();
				volt_var_control.setName(name);
				grid.getConnections().add(volt_var_control);
			}
			else if (type.equals("voltdump")) {
				Voltdump voltdump= factory.createVoltdump();
				voltdump.setName(name);
				grid.getConnections().add(voltdump);
			}
			else if (type.equals("waterheater")) {
				Waterheater waterheater= factory.createWaterheater();
				waterheater.setName(name);
				grid.getConnections().add(waterheater);
			}
			else if (type.equals("weather")) {
				Weather weather= factory.createWeather();
				weather.setName(name);
				grid.getConnections().add(weather);
			}
			else if (type.equals("windturb_dg")) {
				Windturb_dg windturb_dg= factory.createWindturb_dg();
				windturb_dg.setName(name);
				grid.getConnections().add(windturb_dg);
			}
			else if (type.equals("zipload")) {
				ZIPload zipload= factory.createZIPload();
				zipload.setName(name);
				grid.getConnections().add(zipload);
			}	
		}

		/*
		 * Create parent-child connections:
		 * Go through the vector of properties and look for properties that have a parent listed
		 * Then go through the modules connected to grid and find that parent by name
		 * Then go through the modules connected to grid and find the child by name
		 * Finally create a connection from the parent to the child
		 */
		for (int i=0;i<modules.size();i++){
			String parent = modules.get(i).getParent_name();			// Name of the parent
			String moduleName = modules.get(i).getName();				// Name of current module 
			EList<Connection> gridConnection = grid.getConnections();	// Shorthand for items attached to the grid
			if (!parent.equals("(null)")){								// The string will be (null) if gridlab-d doesn't report a parent
				for (int j=0;j<gridConnection.size();j++){		
					String currentName = gridConnection.get(j).getName();	// The name of the current module, we're looking for the parent
					if (parent.equals(currentName)){					// Check if matches the name of the parent
						for (int k=0;k<gridConnection.size();k++){		// If it does, look for the child in the same way
							String childName = gridConnection.get(k).getName();	
							if (childName.equals(moduleName)){			// If the name of the child is the same as the child in the properties vector
								gridConnection.get(j).getConnections().add(gridConnection.get(k));	// Add the child to the parents connections
							}
						}
					}
				}
			}
		}
		try {
			Resource resource = new XMIResourceImpl();
			URI uri = URI.createPlatformResourceURI("exampleplugin/example.visgrid",true);
			resource.setURI(uri);
			resource.getContents().add(grid);
			
			resource.save(Collections.EMPTY_MAP);
		
			IFile visgridFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true)));
			//IProject proj = ResourcesPlugin.getWorkspace().getRoot().getProject("exampleplugin");
			
			new Thread(new EMFThread(visgridFile, window)).start();
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
	System.out.println("Plugin executed");
}



/**
 * Selection in the workbench has been changed. We 
 * can change the state of the 'real' action here
 * if we want, but this can only happen after 
 * the delegate has been created.
 * @see IWorkbenchWindowActionDelegate#selectionChanged
 */
public void selectionChanged(IAction action, ISelection selection) {
}

/**
 * We can use this method to dispose of any system
 * resources we previously allocated.
 * @see IWorkbenchWindowActionDelegate#dispose
 */
public void dispose() {
}

/**
 * We will cache window object in order to
 * be able to provide parent shell for the message dialog.
 * @see IWorkbenchWindowActionDelegate#init
 */
public void init(IWorkbenchWindow window) {
	this.window = window;
}
}