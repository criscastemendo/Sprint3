package com.criscastemendo.sprint3.app;

import android.app.Application;

import com.criscastemendo.sprint3.Data.ContadorItem;
import com.criscastemendo.sprint3.Principal.PrincipalState;
import com.criscastemendo.sprint3.Detalle.DetalleState;

import java.util.List;

public class AppMediator extends Application {


  public int contador;
  private PrincipalState principalState;
  private DetalleState detalleState;
  public List<ContadorItem> contadorItemList;

  @Override
  public void onCreate() {
    super.onCreate();
    principalState = new PrincipalState();
    detalleState = new DetalleState();
  }

  public PrincipalState getPrincipalState() {
    return principalState;
  }

  public void setPrincipalState(PrincipalState state) {
    this.principalState = state;
  }

  public DetalleState getDetalleState() {
    return this.detalleState;
  }

  public void setDetalleState(DetalleState State) {
    this.detalleState= State;
  }
}
